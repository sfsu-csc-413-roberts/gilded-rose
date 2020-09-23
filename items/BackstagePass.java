package items;

public class BackstagePass extends Item {
  public BackstagePass(int daysRemaining, int quality) {
    super(daysRemaining, quality);
  }

  @Override
  public void tick() {
    daysRemaining -= 1;

    quality += 1;

    if (daysRemaining < 5 && daysRemaining >= 0) {
      quality += 2;
    } else if (daysRemaining < 0) {
      quality = 0;
    } else if (daysRemaining < 10) {
      quality += 1;
    }

    if (quality > 50) {
      quality = 50;
    }
  }

}
