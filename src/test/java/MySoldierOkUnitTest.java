
import com.di.MySoldierOK;
import com.di.Weapon;
import org.junit.Test;
import static org.mockito.Mockito.*;


public class MySoldierOkUnitTest {

    @Test // 單元測試(unit test)
    public void t1() {
        Weapon mockWeapon = mock(Weapon.class); // 使用mock建立偽冒物件
        MySoldierOK soldier = new MySoldierOK(mockWeapon);
        soldier.destoryTarget();
        verify(mockWeapon, times(1)).attack();
    }
}
