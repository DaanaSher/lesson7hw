package com.company.players;

import com.company.others.AbilityType;
import com.company.boss.Boss;

public class Magical extends Hero {

    public Magical(int health, int damage) {
        super(health, damage, AbilityType.BOOST);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {

    }
}
