package items;

import java.util.HashMap;

public class ItemFactory {

  private static HashMap<String, String> nameMap = new HashMap<>();
  static {
    nameMap.put("Normal Item", "NormalItem");
    nameMap.put("Aged Brie", "AgedBrieItem");
    nameMap.put("Sulfuras, Hand of Ragnaros", "SulfurasItem");
    nameMap.put("Backstage passes to a TAFKAL80ETC concert", "BackstagePassItem");
    nameMap.put("Conjured Mana Cake", "ManaItem");
  }

  public static Item getItem(String name) {
    try {
      return (Item) Class.forName("items." + nameMap.get(name)).newInstance();
    } catch(Exception exception) {
      return null;
    }
  }
}