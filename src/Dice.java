package jp.ac.uryukyu.ie.ex3;

public class Dice {
    //フィールド変数                                                            
    private int value;

    //コンストラクタ                                                            
    public Dice(){
	play();
    }
 //アクセサメソッド                                                          
    public int getValue(){
	return value;
    }
    public void setValue(int value){
	this.value = value;
    }

    //乱数による出目設定                                                        
    public void play(){
	this.value = (int)(Math.random()*6) + 1;
    }
}
