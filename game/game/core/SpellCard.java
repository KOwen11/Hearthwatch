/**
 * Created by Kevin on 1/28/2017.
 */
public class SpellCard {

    public static Card discordOrb;
    public static Card scope;

    static{
        discordOrb = newDiscordOrb();
        scope = newScope();
    }

    public static Card newDiscordOrb(){
        Card x = new Card();
        x.id = 53;
        x.name = "Discord Orb";
        x.type = "Spell";
        x.cost = 1;
        x.trait = "";
        x.ability = "";
        x.baseImg = "";
        x.cardImg = "";
        return x;
    }

    public static Card newScope(){
        Card x = new Card();
        x.id = 54;
        x.name = "Scope";
        x.type = "Spell";
        x.cost = 5;
        x.effect = "";
        x.ability = "";
        x.baseImg = "";
        x.cardImg = "";
        return x;
    }
}
