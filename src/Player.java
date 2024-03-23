interface Punch {
    void punchAction();
}

interface Kick {
    void kickAction();
}

public class Player {
    Punch punch;
    Kick kick;

    public void pushTriangle() {
        punch.punchAction();
    }

    public void pushCross() {
        kick.kickAction();
    }
}

class SwordPunch implements Punch {
    @Override
    public void punchAction() {
        System.out.println("Slash With Sword");
    }
}

class UppercutPunch implements Punch {
    @Override
    public void punchAction() {
        System.out.println("Do Uppercut Punch");
    }
}

class FlyingKick implements Kick {
    @Override
    public void kickAction() {
        System.out.println("Do Flying Kick to Opponent");
    }
}

class LowerKick implements Kick {
    @Override
    public void kickAction() {
        System.out.println("do low kick to opponent's leg");
    }
}
