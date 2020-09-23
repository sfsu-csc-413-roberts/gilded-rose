package items;

public class AgedBrie extends Item {
    public AgedBrie(int daysRemaining, int quality) {
    super(daysRemaining, quality);
  }

  @Override
  public void tick() {
    daysRemaining -= 1;

    quality += 1;

    if (daysRemaining < 0) {
      quality += 1;
    }

    if (quality > 50) {
      quality = 50;
    }
  }
}
