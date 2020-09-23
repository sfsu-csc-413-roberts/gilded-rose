package items;

public abstract class Item {
  protected int daysRemaining;
  protected int quality;

  public Item(int daysRemaining, int quality) {
    this.daysRemaining = daysRemaining;
    this.quality = quality;
  }

  public abstract void tick();

  public int getDaysRemaining() {
    return daysRemaining;
  }

  public int getQuality() {
    return quality;
  }
}
