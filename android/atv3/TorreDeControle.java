import java.util.Observer;
import java.util.Observable;

class TorreDeControle implements Observer

{
    String identifier;

    TorreDeControle(String identifier)
    {
        setIdentifier(identifier);
    }

    String getIdentifier()
    {
        return this.identifier;
    }

    void setIdentifier(String newIdentifier)
    {
        this.identifier = newIdentifier;
        return;
    }

    public void update(Observable obj, Object atualizacaoStatus)
    {
        String state = (String) atualizacaoStatus;
        System.out.println(state);
        System.out.println(this.identifier);
    }

}