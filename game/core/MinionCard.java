/**
 * Created by Kevin on 1/28/2017.
 */
public class MinionCard {

    public static Card lOneTurret;
    public static Card lTwoTurret;
    public static Card lThreeTurret;

    static{
        lOneTurret = newLOneTurret();
        lTwoTurret = newLTwoTurret();
        lThreeTurret = newLThreeTurret();
    }

    public static Card newLOneTurret(){
        Card x = new Card();
        x.id = 50;
        x.hp = 1;
        x.dmg = 1;
        x.cost = 0;
        x.name = "Level 1 Turret";
        x.type = "Unit";
        x.trait = "";
        x.startTurnAbility = "Upgrade"; //if turret survives discard this card and summon a level two turret.
        x.baseImg = "";
        x.cardImg = "";
        return x;
    }

    public static Card newLTwoTurret(){
        Card x = new Card();
        x.id = 51;
        x.hp = 3;
        x.dmg = 2;
        x.cost = 0;
        x.name = "Level 2 Turret";
        x.type = "Unit";
        x.trait = "";
        x.startTurnAbility = "Upgrade"; //if turret survives discard this card and summon a level three turret
        x.baseImg = "";
        x.cardImg = "";
        return x;
    }

    public static Card newLThreeTurret(){
        Card x = new Card();
        x.id = 52;
        x.hp = 6;
        x.dmg = 6;
        x.cost = 0;
        x.name = "Level 3 Turret";
        x.type = "Unit";
        x.trait = "";
        x.ability = ""; //
        x.baseImg = "";
        x.cardImg = "";
        return x;
    }
}
