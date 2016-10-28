package sample;
import javafx.beans.binding.ListBinding;

import java.util.ArrayList;
import java.util.List;

public class perssone {
    private string nom;
    private string nat;
    private int age;
    private int nba;

  public string getNom(){
      return this.nom;
  }
public string getNat(){

    return this.nat;
}
public int getAge(){

    return this.age;
}
public int getNba(){

    return this.nba;
}

public void MA(){

    for (int i = 0; i< ListB.size(); i++)
    {

        System.out.println(this.ListB.get(i).getNom()+" from "+this.ListB.get(i).getNat());
    }
}
public void MAE(){

    for (int i = 0; i< ListB.size(); i++)
    {
        if (!this.Nat.equals(ListB.get(i).getNat()))
        {
            System.out.println("Mr. "+this.ListB.get(i).getNom()+" from "+this.ListB.get(i).getNat());
        }
    }
}

}
