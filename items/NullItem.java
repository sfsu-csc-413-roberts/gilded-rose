package items;

public class NullItem extends Item {
  public NullItem(int daysRemaining, int quality) {
    super(daysRemaining, quality);
  }

  @Override
  public void tick() {
    // Intentional no-op
  }

}
