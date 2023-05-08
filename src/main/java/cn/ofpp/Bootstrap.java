package cn.ofpp;

import cn.hutool.core.util.StrUtil;
import cn.ofpp.core.Wx;

/**
 * 引导配置
 *
 * @author DokiYolo
 * Date 2022-08-22
 */
public class Bootstrap {

    /**
     * 公众号AppID
     */
    public static final String APP_ID = "wx26ad86a9b3a162a0";

    /**
     * 公众号秘钥
     */
    public static final String SECRET = "5e034913a62d4aaf232732afc4c1a6cf";

    /**
     * 全局模板ID  也可针对单个Friend指定模板
     */
    public static final String TEMPLATE_ID = "68saFCoxtgQS1N_aolPW-Slg_EdiCAmJi31EEaucU6M";

    /**
     * 初始化
     */
    public static void init() {
        if (StrUtil.hasEmpty(APP_ID, SECRET, TEMPLATE_ID)) {
            throw new IllegalArgumentException("请检查配置");
        }
        Wx.init();
    }

}
