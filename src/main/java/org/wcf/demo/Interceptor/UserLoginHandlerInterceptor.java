package org.wcf.demo.Interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Component
public class UserLoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj)throws Exception{
        /*该方法将在请求处理之前进行调用，只有该方法返回true，
        才会继续执行后续的Interceptor和Controller，当返回值为true 时就会继续调用下一个Interceptor的preHandle 方法，
        如果已经是最后一个Interceptor的时候就会是调用当前请求的Controller方法；*/
        return true;
    }
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,Object obj,Exception e)throws Exception {
        /*在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）*/
    }
    @Override
    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,Object arg2,ModelAndView arg3) throws Exception {
        /*该方法也是需要当前对应的Interceptor的preHandle方法的返回值为true时才会执行，
        DispatcherServlet进行视图返回渲染之前进行调用，可以在这个方法中对Controller 处理之后的ModelAndView 对象进行操作*/
    }
}
