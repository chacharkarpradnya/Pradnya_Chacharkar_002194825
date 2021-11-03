package business;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author pradnya
 */
public class VitalSign {
    
    private int rateRespiratory;
    private int rateHeart;
    private int pressureBlood;
    private int personWeight;
    private Date timestamp;
    
    public int getRateRespiratory() {
        return rateRespiratory;
    }
    
    public void setRateRespiratory(int rateRespiratory) {
        this.rateRespiratory = rateRespiratory;
    }
    
    public int getRateHeart() {
        return rateHeart;
    }
    
    public void setRateHeart(int rateHeart) {
        this.rateHeart = rateHeart;
    }
    
    public int getPressureBlood() {
        return pressureBlood;
    }
    
    public void setPressureBlood(int pressureBlood) {
        this.pressureBlood = pressureBlood;
    }
    
    public int getPersonWeight() {
        return personWeight;
    }
    
    public void setPersonWeight(int personWeight) {
        this.personWeight = personWeight;
    }
    
    public Date getTimestamp() {
        return timestamp;
    }
    
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
    
    @Override
    public String toString() {
        SimpleDateFormat ft = new SimpleDateFormat("MM/dd/yyyy 'at' hh:mm:ss a");
        return ft.format(timestamp);
    }
}
