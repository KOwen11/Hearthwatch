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
	public String description;
	public String handToBoardAbility;
	public String deathAbility;
	public String playerChoiceAbility;
	public String attackAbility;
	public String endTurnAbility;
	public String startTurnAbility;
	public String multiTurnAbility;
	public String onDamageAbility;
	public String effect;
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


