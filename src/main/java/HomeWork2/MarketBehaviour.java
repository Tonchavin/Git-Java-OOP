package HomeWork2;

import java.util.List;

public interface MarketBehaviour {
    void acceptToMarket(HomeWork2.Actor actor);
    void releaseFromMarket(List<Actor> actors);
    void update();
}