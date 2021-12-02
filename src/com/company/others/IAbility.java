package com.company.others;

import com.company.boss.Boss;
import com.company.players.Hero;

public interface IAbility {
    void useAbility(Hero[] heroes, Boss boss);
}