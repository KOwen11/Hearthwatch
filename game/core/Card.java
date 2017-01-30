import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Card {
	public int id;
	public int cost;
	public int dmg;
	public int hp;
	public String baseImg;
	public String cardImg;
	public String name;
	public String type;
	public String trait;
	public String ability;
	public String abilityName;
	public String startTurnAbility;
	public String effect;

	public static Card newAna(){
		Card x = new Card();
		x.id = 1;
		x.hp = 4;
		x.dmg = 3;
		x.cost = 5;
		x.name = "Ana";
		x.type = "Hero";
		x.trait = "";
		x.abilityName = "Grenade"; //prevents healing 1-turn
		x.baseImg = "";
		x.cardImg = "";
		return x;
	}

	public static Card newBastion() {
		Card x = new Card();
		x.id = 2;
		x.hp = 4;
		x.dmg = 1;
		x.cost = 4;
		x.name = "Bastion";
		x.type = "Hero";
		x.trait = "";
		x.abilityName = "Turret Mode"; //player chooses to summon "Turret Bastion" or "Scout Bastion"
		x.baseImg = "";
		x.cardImg = "";
		return x;
	}

	public static Card newDva() {
		Card x = new Card();
		x.id = 3;
		x.hp = 8;
		x.dmg = 2;
		x.cost = 6;
		x.name = "Dva";
		x.type = "Hero";
		x.trait = "Tank";
		x.abilityName = "Mecha"; // summons gremlin Dva
		x.baseImg = "";
		x.cardImg = "";
		return x;
	}

	public static Card newGenji() {
		Card x = new Card();
		x.id = 4;
		x.hp = 3;
		x.dmg = 4;
		x.cost = 3;
		x.name = "Genji";
		x.type = "Hero";
		x.trait = "";
		x.abilityName = "Dash"; //if Genji kills an enemy deal 2 damage to enemy player
		x.baseImg = "";
		x.cardImg = "";
		return x;
	}

	public static Card newHanzo() {
		Card x = new Card();
		x.id = 5;
		x.hp = 3;
		x.dmg = 5;
		x.cost = 5;
		x.name = "Hanzo";
		x.type = "Hero";
		x.trait = "";
		x.abilityName = "Dragon Bow"; //deal 5 damage to a random enemy minion
		x.baseImg = "";
		x.cardImg = "";
		return x;
	}

	public static Card newJunkrat() {
		Card x = new Card();
		x.id = 6;
		x.hp = 3;
		x.dmg = 6;
		x.cost = 4;
		x.name = "Junkrat";
		x.type = "Hero";
		x.trait = "";
		x.abilityName = "Nade Spam"; //33% chance to hit
		x.baseImg = "";
		x.cardImg = "";
		return x;
	}

	public static Card newLucio() {
		Card x = new Card();
		x.id = 7;
		x.hp = 4;
		x.dmg = 2;
		x.cost = 3;
		x.name = "Lucio";
		x.type = "Hero";
		x.trait = "";
		x.abilityName = "Amp it up!"; //heal all allies 1hp at end of turn
		x.baseImg = "";
		x.cardImg = "";
		return x;
	}

	public static Card newMccree(){
		Card x = new Card();
		x.id = 8;
		x.hp = 3;
		x.dmg = 4;
		x.cost = 4;
		x.name = "McCree";
		x.type = "Hero";
		x.trait = "";
		x.abilityName = "Fan The Hammer"; //deal 1 damage split randomly among enemies when placed on the board
		x.baseImg = "";
		x.cardImg = "";
		return x;
	}

	public static Card newMei(){
		Card x = new Card();
		x.id = 9;
		x.hp = 4;
		x.dmg = 1;
		x.cost = 3;
		x.name = "Mei";
		x.type = "Hero";
		x.trait = "";
		x.abilityName = "Cryo Gun"; //Freeze any character damaged by this hero
		x.baseImg = "";
		x.cardImg = "";
		return x;
	}

	public static Card newMercy(){
		Card x = new Card();
		x.id = 10;
		x.hp = 4;
		x.dmg = 1;
		x.cost = 5;
		x.name = "Mercy";
		x.type = "Hero";
		x.trait = "";
		x.abilityName = "Healing Beam"; // Restore 3 hp to one random ally at end of turn
		x.baseImg = "";
		x.cardImg = "";
		return x;
	}

	public static Card newPharah(){
		Card x = new Card();
		x.id = 11;
		x.hp = 3;
		x.dmg = 4;
		x.cost = 5;
		x.name = "Pharah";
		x.type = "Hero";
		x.trait = "";
		x.abilityName = "Splash Damage"; //also deal 1 damage to adjacent enemies
		x.baseImg = "";
		x.cardImg = "";
		return x;
	}

	public static Card newReaper(){
		Card x = new Card();
		x.id = 12;
		x.hp = 4;
		x.dmg = 4;
		x.cost = 4;
		x.name = "Reaper";
		x.type = "Hero";
		x.trait = "";
		x.abilityName = "Edgy af"; //if reaper kills an enemy and lives heal for 1 hp
		x.baseImg = "";
		x.cardImg = "";
		return x;
	}

	public static Card newReinhardt(){
		Card x = new Card();
		x.id = 13;
		x.hp = 6;
		x.dmg = 1;
		x.cost = 4;
		x.name = "Reinhardt";
		x.type = "Hero";
		x.trait = "Tank";
		x.abilityName = "Hammer Time"; // also hits enemies adjacent to target
		x.baseImg = "";
		x.cardImg = "";
		return x;
	}

	public static Card newRoadhog(){
		Card x = new Card();
		x.id = 14;
		x.hp = 6;
		x.dmg = 3;
		x.cost = 6;
		x.name = "Roadhog";
		x.type = "Hero";
		x.trait = "Tank";
		x.abilityName = "Vape"; // receive one Vape card in hand when played
		x.baseImg = "";
		x.cardImg = "";
		return x;
	}

	public static Card newSoldier(){
		Card x = new Card();
		x.id = 15;
		x.hp = 4;
		x.dmg = 4;
		x.cost = 5;
		x.name = "Soldier 76";
		x.type = "Hero";
		x.trait = "";
		x.abilityName = "Helix Rockets";
		x.baseImg = "";
		x.cardImg = "";
		return x;
	}

	public static Card newSombra(){
		Card x = new Card();
		x.id = 16;
		x.hp = 3;
		x.dmg = 2;
		x.cost = 3;
		x.name = "Sombra";
		x.type = "Hero";
		x.trait = "";
		x.abilityName = "Hack"; //silence 1 hero
		x.baseImg = "";
		x.cardImg = "";
		return x;
	}

	public static Card newSymmetra(){
		Card x = new Card();
		x.id = 17;
		x.hp = 4;
		x.dmg = 1;
		x.cost = 4;
		x.name = "Symmetra";
		x.type = "Hero";
		x.trait = "";
		x.abilityName = "Car Wash"; //summon two 1/1 sentry turrets
		x.baseImg = "";
		x.cardImg = "";
		return x;
	}

	public static Card newTorbjorn(){
		Card x = new Card();
		x.id = 18;
		x.hp = 4;
		x.dmg = 2;
		x.cost = 5;
		x.name = "Torbjorn";
		x.type = "Hero";
		x.trait = "";
		x.abilityName = "Build Turret"; //summon a 1/1 turret
		x.baseImg = "";
		x.cardImg = "";
		return x;
	}

	public static Card newTracer(){
		Card x = new Card();
		x.id = 19;
		x.hp = 2;
		x.dmg = 2;
		x.cost = 3;
		x.name = "tracer";
		x.type = "hero";
		x.trait = "";
		x.abilityName = "recall"; // if tracer attacks and survives restore to max health
		x.baseImg = "";
		x.cardImg = "";
		return x;
	}

	public static Card newWidowmaker(){
		Card x = new Card();
		x.id = 20;
		x.hp = 2;
		x.dmg = 4;
		x.cost = 4;
		x.name = "Widowmaker";
		x.type = "Hero";
		x.trait = "";
		x.abilityName = "Tunnel Vision"; //widow takes no damage when attacking. deals half damage when attacked
		x.baseImg = "";
		x.cardImg = "";
		return x;
	}

	public static Card newWinston(){
		Card x = new Card();
		x.id = 21;
		x.hp = 6;
		x.dmg = 1;
		x.cost = 4;
		x.name = "winston";
		x.type = "hero";
		x.trait = "tank";
		x.abilityName = "tesla cannon"; //attacks hit all enemies.
		x.baseImg = "";
		x.cardImg = "";
		return x;
	}

	public static Card newZarya(){
		Card x = new Card();
		x.id = 22;
		x.hp = 7;
		x.dmg = 1;
		x.cost = 4;
		x.name = "Zarya";
		x.type = "Hero";
		x.trait = "Tank";
		x.abilityName = "Barrier"; // +2 dmg when zarya takes damage
		x.baseImg = "";
		x.cardImg = "";
		return x;
	}

	public static Card newZenyatta(){
		Card x = new Card();
		x.id = 23;
		x.hp = 3;
		x.dmg = 3;
		x.cost = 4;
		x.name = "Zenyatta";
		x.type = "";
		x.trait = "";
		x.abilityName = "Discord Orb"; //when played select one enemy to discord
		x.baseImg = "";
		x.cardImg = "";
		return x;
	}

}
/*
	public void setId(int x) {
		id = x;
	}

	public int getId() {
		return id;
	}

	public void setCost(int x) {
		if (x >= 0) {
			cost = x;
		}
	}

	public int getCost() {
		return cost;
	}

	public void setDmg(int x) {
		if (x >= 0) {
			dmg = x;
		}
	}

	public int getDmg() {
		return dmg;
	}

	public void setHp(int x) {
		if (x > 0) {
			hp = x;
		}
	}

	public int getHp() {
		return hp;
	}

	public void setBaseImg(String x) {
		baseImg = x;
	}

	public String getBaseImg() {
		return baseImg;
	}

	public void setCardImg(String x) {
		cardImg = x;
	}

	public String getCardImg() {
		return cardImg;
	}

	public void setName(String x) {
		if (x.length() > 0) {
			name = x;
		}
	}

	public String getName() {
		return name;
	}

	public void setType(String x) {
		if (x.length() > 0) {
			type = x;
		}
	}

	public String getType() {
		return type;
	}

	public void setTrait(String x) {
		if (x.length() > 0) {
			trait = x;
		} else {
			trait = "none";
		}
	}

	public String getTrait() {
		return trait;
	}

	public void setAbility(String x) {
		if (x.length() > 0) {
			ability = x;
		} else {
			ability = "none";
		}
	}

	public String getAbility() {
		return ability;
	}

	public void setDescription(String x) {
		if (x.length() > 0) {
			description = x;
		} else {
			description = "";
		}
	}

	public String getDescription() {
		return description;
	}
}
*/
	/*
        public static void main(String[] args){
            Card tracerCard = new Card();
            tracerCard.run();
        }

        private void run() {
            ObjectMapper mapper = new ObjectMapper();

            com.mkyong.json.Card tracerTest = tracer();

            try {
                mapper.writeValue(new File("F:\\JavaApps\\Hearthwatch\\game\\core"), tracerTest);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }



        public com.mkyong.json.Card tracer() {
            com.mkyong.json.Card x = new Card();
            x.setId(1);
            x.setCost(2);
            x.setDmg(2);
            x.setHp(2);
            x.setName("Tracer");
            x.setType("Unit");
            x.setTrait("Charge");
            x.setAbility("Recall");
            return tracer();
        }

    */


