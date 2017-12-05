public class Spiral {
  public static int findDistance(int x) {
    double sqrt = Math.sqrt(x);
    int level = (int) (Math.floor(sqrt));
    if (level % 2 == 1) {
      level++;
    }
    level /= 2;
    if (level < 2) {
      return level;
    }
    if (Math.floor(sqrt) == Math.ceil(sqrt) && Math.floor(sqrt) % 2 == 1) {
      return (level - 1) * 2;
    }
    int dToLevelOrigin = (int) (x - Math.pow(2 * level - 1, 2)) - 1;
    if ((dToLevelOrigin + 1) % (2 * level) == 0) {
      return level * 2;
    }
    int sideNum = 0;
    int dTracker = dToLevelOrigin;
    while (dTracker - 2 * level >= 0) {
      dTracker -= 2 * level;
      sideNum++;
    }
    int sideMid = (int) (Math.pow(2 * level - 1, 2)) + level + 2 * level * sideNum;
    return level + Math.abs(sideMid - x);
  }

  public int findLeastAfter(int limit) {
    int[][] spiral = new int[1000][1000];
    int x, y, i, direction;
    x = y = 500;
    i = 2;
    d = 1; // right=0, up=1, left=2, down=3

    spiral[x][y] = 1;
    x++;
    spiral[x][y] = 1;
    y++;
  }
}
