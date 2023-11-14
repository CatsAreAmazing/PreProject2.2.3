package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Needle7 {

    private final Deth8 death; //Только не очень понятно зачем, когда с нее ничего не идет,
    // но допустим, что для последнего варианта связи

    @Autowired
    public Needle7(Deth8 death) {
        this.death = death;
    }

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + "";
    }
}
