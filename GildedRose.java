public class GildedRose {
  private String name;
  private int quality, daysRemaining;

  public GildedRose(String name, int daysRemaining, int quality) {
    this.name = name;
    this.quality = quality;
    this.daysRemaining = daysRemaining;
  }

  public int getDaysRemaining() {
    return daysRemaining;
  }

  public int getQuality() {
    return quality;
  }

  public void tick() {
    if(this.name.equals("Normal Item")) {
      this.daysRemaining -= 1;

      if (this.daysRemaining <= 0) {
        this.quality = this.quality - 1;
      }

      this.quality = this.quality - 1;

      if (this.quality < 0) {
        this.quality = 0;
      }
    } else if(this.name.equals("Aged Brie")) {
      this.daysRemaining -= 1;

      this.quality += 1;

      if (this.daysRemaining < 0) {
        this.quality += 1;
      }

      if(this.quality > 50) {
        this.quality = 50;
      }
    } else if(this.name.equals("Sulfuras, Hand of Ragnaros")) {

    } else if(this.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
      this.daysRemaining -= 1;
      this.quality += 1;

      if(this.daysRemaining < 0) {
        this.quality = 0;
      } else if (this.daysRemaining >= 5 && this.daysRemaining < 10 ) {
        this.quality += 1;
      } else if (this.daysRemaining < 5 ) {
        this.quality += 2;
      }

      if (this.quality >= 50) {
        this.quality = 50;
      }
    } else if(this.name.equals("Conjured Mana Cake")) {
      this.daysRemaining -= 1;
      this.quality -= 2;

      if(this.daysRemaining < 0) {
        this.quality -=2;
      }

      if(this.quality < 0) {
        this.quality = 0;
      }
    }

    return;
  }
}
