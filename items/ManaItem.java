package items;

public class ManaItem extends Item {
  public ManaItem() {
    super();
  }
  
  @Override
  public void tick() {
    this.daysRemaining -= 1;
    this.quality -= 2;

    if (this.daysRemaining < 0) {
      this.quality -= 2;
    }

    if (this.quality < 0) {
      this.quality = 0;
    }
  }
}