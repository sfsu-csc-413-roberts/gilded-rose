package items;

import java.util.HashMap;

public class ItemFactory {
  private static HashMap<String, String> classNames = new HashMap<>();
  static {
    classNames.put("Normal Item", "items.NormalItem");
    classNames.put("Aged Brie", "items.AgedBrie");
    classNames.put("Backstage passes to a TAFKAL80ETC concert", "items.BackstagePass");
    classNames.put("Sulfuras, Hand of Ragnaros", "items.Sulfuras");
    classNames.put("Conjured Mana Cake", "items.ConjuredManaCake");
  }

  public static Item getItem(String name, int daysRemaining, int quality) {
    String className = classNames.get(name);

    if (className == null) {
      className = "items.NullItem";
    }

    Class[] parameters = new Class[] { int.class, int.class };
    try {
      return (Item)
        Class.forName(className)
          .getConstructor(parameters)
          .newInstance(daysRemaining, quality);
    } catch (Exception e) {
      e.printStackTrace();
      return new NullItem(daysRemaining, quality);
    }
  }
}
