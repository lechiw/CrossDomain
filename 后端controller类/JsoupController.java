package com.sofn.web.sso;
import com.alibaba.dubbo.common.json.JSON;
/**
 * @author liw
 * @version 2017年5月10日 下午 21:50
 * 此类为springmvc的一个controller,客户端通过调用即可跨域获取数据
 */
@RestController
@RequestMapping(value = "/ssoMenu", method = RequestMethod.POST)
public class SSOUserMenuController extends BaseController {
    @RequestMapping(value = "getAuthorityByToken", method = RequestMethod.GET)
    public void getMobileAuthCode(String token,String type,String callback,HttpServletResponse response)
            throws Exception {
        String result =  "{'ret':'true'}";
        //加上返回参数
        result=callback+"("+result+")";
		response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();
		writer.write(result);
        writer.flush();
        writer.close();
    }
}
