import items.AgedBrie;
import items.BackstagePass;
import items.ConjuredManaCake;
import items.Item;
import items.ItemFactory;
import items.NormalItem;
import items.Sulfuras;

public class GildedRose {
  private Item item;

  public GildedRose(String name, int daysRemaining, int quality) {
    item = ItemFactory.getItem(name, daysRemaining, quality);
  }

  public int getDaysRemaining() {
    return item.getDaysRemaining();
  }

  public int getQuality() {
    return item.getQuality();
  }

  public void tick() {
    item.tick();
  }
}
