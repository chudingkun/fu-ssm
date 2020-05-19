import com.fuhao.dao.MessageMapper;
import com.fuhao.pojo.Message;
import com.fuhao.service.MessageService;
import com.fuhao.service.MessageServiceImpl;
import com.fuhao.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TTT {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
         MessageService messageMapper= (MessageService) applicationContext.getBean("MessageServiceImpl");
        for (Message message:messageMapper.getMessageList()
             ) {
            System.out.println(message);
        }


    }
}
