package refactor;

import java.util.Date;

/**
 * Created by wu on 2017/7/3.
 * 指把一些很多地方都用到的逻辑提炼出来，然后提供给调用者统一调用。
 */
public class Day_15_RemoveDuplication {
    
    /*---------------------------before--------------------------*/
    public class MedicalRecord{
        public Date DateArchived ;
        public boolean Archived;

        public void ArchiveRecord(){
            Archived = true;
            DateArchived = new Date();
        }

        public void CloseRecord(){
            Archived = true;
            DateArchived = new Date();
        }
    }


    /*---------------------------after---------------------------*/
    public class MedicalRecord1{
        public Date DateArchived ;
        public boolean Archived;

        public void ArchiveRecord()
        {
            init();
        }

        public void CloseRecord()
        {
            init();
        }
        public void init()
        {
            Archived = true;
            DateArchived = new Date();
        }
    }
}
