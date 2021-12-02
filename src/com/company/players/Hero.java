package com.company.players;

import com.company.others.AbilityType;
import com.company.others.GameEntity;
import com.company.others.IAbility;

public abstract class Hero extends GameEntity implements IAbility {

    public AbilityType ability;

    public Hero(int health, int damage, AbilityType ability) {
        super(health, damage);
        this.ability = ability;
    }
}
