class PezDispenser {

    private final String characterName;
    public static final int MAX_PEZ = 12;
    private int pezCount;

    public PezDispenser(String characterName){
        this.characterName = characterName;
        pezCount = 0;
    }

    public void fill(){
         fill(MAX_PEZ);
    }
    public String getCharacterName(){
        return characterName;
    }

    public int getPezCount(){
        return pezCount;
    }

    public boolean isEmpty(){
        return pezCount == 0;
    }

    public boolean dispense(){
        boolean wasDispensed = false;
        if(!isEmpty()){
            pezCount--;
            wasDispensed = true;
        }
        return wasDispensed;
    }

    public void fill(int pezAmount){
        int newAmount = pezAmount+ pezCount;
        if(newAmount > MAX_PEZ){
            throw new IllegalArgumentException("That's too many PEZ to insert!!!");
        }
        pezCount = newAmount;
    }
}
