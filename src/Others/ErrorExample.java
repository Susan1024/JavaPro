package Others;

public class ErrorExample {
        private String key;
        private String value;
        public String getKey{
        return key;
        }
        public void setKey(String key){
        this.key = key;
        }
        public String getValue{
        returnvalue;
        }
        publicvoid setValue(String value){
        this.value = value;
        }
        }
class BusinessProcess{
    private DebugLog log = LogFactory.getDebugLog(BusinessProcess.class);
    public void doBusiness(ErrorExample){
        try{
            s
        }catch(PMSException e){
// MdspProductExt未重载toString方法，日志中无法记录对象内属性的值，只能记录对象地址
            log.error("error while process prodExt " +prodExt);
        }}}
