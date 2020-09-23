package items;

public class ConjuredManaCake extends Item {
  public ConjuredManaCake(int daysRemaining, int quality) {
    super(daysRemaining, quality);
  }

  @Override
  public void tick() {
    daysRemaining -= 1;
    quality -= 2;

    if(daysRemaining < 0) {
      quality -= 2;
    }

    if(quality < 0) {
      quality = 0;
    }
  }
}
