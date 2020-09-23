import items.AgedBrie;
import items.BackstagePass;
import items.ConjuredManaCake;
import items.Item;
import items.NormalItem;
import items.Sulfuras;

public class GildedRose {
  private String name;
  private int quality, daysRemaining;

  private Item item;

  public GildedRose(String name, int daysRemaining, int quality) {
    this.name = name;
    this.quality = quality;
    this.daysRemaining = daysRemaining;

    if(name.equals("Normal Item")) {
      item = new NormalItem(daysRemaining, quality);
    } else if(name.equals("Aged Brie")) {
      item = new AgedBrie(daysRemaining, quality);
    } else if(name.equals("Backstage passes to a TAFKAL80ETC concert")) {
      item = new BackstagePass(daysRemaining, quality);
    } else if(name.equals("Sulfuras, Hand of Ragnaros")) {
      item = new Sulfuras(daysRemaining, quality);
    } else if(name.equals("Conjured Mana Cake")) {
      item = new ConjuredManaCake(daysRemaining, quality);
    }
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
