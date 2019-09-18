package items;

public class NormalItem extends Item {
  public NormalItem() {
    super();
  }

  @Override
  public void tick() {
    this.daysRemaining -= 1;

    if (this.daysRemaining <= 0) {
      this.quality = this.quality - 1;
    }

    this.quality = this.quality - 1;

    if (this.quality < 0) {
      this.quality = 0;
    }
  }
}