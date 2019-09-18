package items;

public class BackstagePassItem extends Item {
  public BackstagePassItem() {
    super();
  }

  @Override
  public void tick() {
    this.daysRemaining -= 1;
    this.quality += 1;

    if (this.daysRemaining < 0) {
      this.quality = 0;
    } else if (this.daysRemaining >= 5 && this.daysRemaining < 10) {
      this.quality += 1;
    } else if (this.daysRemaining < 5) {
      this.quality += 2;
    }

    if (this.quality >= 50) {
      this.quality = 50;
    }
  }
}