package items;

public class AgedBrieItem extends Item {
  public AgedBrieItem() {
    super();
  }
  
  @Override
  public void tick() {
    this.daysRemaining -= 1;
    this.quality += 1;

    if(this.daysRemaining < 0) {
      this.quality += 1;
    }

    if(this.quality > 50) {
      this.quality = 50;
    }
  }
}