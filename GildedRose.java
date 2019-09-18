import items.*;

public class GildedRose {
  private Item item;

  public GildedRose(String name, int daysRemaining, int quality) {
    this.item = ItemFactory.getItem(name);
    this.item.setDaysRemaining(daysRemaining);
    this.item.setQuality(quality);
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
