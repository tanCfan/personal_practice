package com.fengyi.pattern.adapter;

/**
 * @author fengyi
 * @version 创建时间：2022/3/16 16:02
 * @description: 双孔插座
 */
public class TwoHoleSocketThreeHolePlugsAdapter extends ThreeHolePlugs implements TwoHoleSocket  {

    public TwoHoleSocketThreeHolePlugsAdapter (String power) {
        super(power);
    }

    @Override
    public void accessToTwoHolePlug() {
        plugIntoThreeHoleSocket();
    }
}
