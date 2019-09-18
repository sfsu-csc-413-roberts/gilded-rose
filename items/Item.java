package items;

public abstract class Item {
  protected String name;
  protected int quality;
  protected int daysRemaining;

  public Item() {
    // no op
  }
  
  public abstract void tick();

  public int getQuality() {
    return this.quality;
  }

  public int getDaysRemaining() {
    return this.daysRemaining;
  }

  public void setQuality(int quality) {
    this.quality = quality;
  }

  public void setDaysRemaining(int daysRemaining) {
    this.daysRemaining = daysRemaining;
  }
}