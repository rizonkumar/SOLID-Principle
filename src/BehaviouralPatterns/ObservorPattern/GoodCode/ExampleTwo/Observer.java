// The Observer interface defines the update method for receiving stock price change notifications.

package BehaviouralPatterns.ObservorPattern.GoodCode.ExampleTwo;

public interface Observer {
    void update(String stockSymbol, double newPrice);
}