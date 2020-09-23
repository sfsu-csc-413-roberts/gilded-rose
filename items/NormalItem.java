package items;

public class NormalItem extends Item {
  public NormalItem(int daysRemaining, int quality) {
    super(daysRemaining, quality);
  }

  @Override
  public void tick() {
    daysRemaining -= 1;
    quality -= 1;

    if (daysRemaining < 0) {
      quality -= 1;
    }

    if (quality < 0) {
      quality = 0;
    }
  }
}