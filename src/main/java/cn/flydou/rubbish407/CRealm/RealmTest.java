package cn.flydou.rubbish407.CRealm;
//import cn.flydou.rubbish407.service.UserService;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import javax.annotation.Resource;
//import java.util.Set;
///**
// * Created with IDEA
// * Created by ${jie.chen} on 2016/7/14.
// * Shiro自定义域
// */
///**
// * Created by Eraser on 2017/6/2.
// */
public class RealmTest extends AuthorizingRealm {
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        return null;
    }
}


////           /**
//     //         * 用于的权限的认证。
//     //         * @param principalCollection
//     //         * @return
//     //         */
////        @Autowired
////        private UserService userService;
////        @Override
////        protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
////            String username = principalCollection.getPrimaryPrincipal().toString() ;
////            SimpleAuthorizationInfo info = new SimpleAuthorizationInfo() ;
////            Set<String> roleName = username.findRoles(username) ;
////            Set<String> permissions = t_userService.findPermissions(username) ;
////            info.setRoles(roleName);
////            info.setStringPermissions(permissions);
////            return info;
////        }
////        /**
////         * 首先执行这个登录验证
////         * @param token
////         * @return
////         * @throws AuthenticationException
////         */
////        @Override
////        protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token)
////                throws AuthenticationException {
////            //获取用户账号
////            String username = token.getPrincipal().toString() ;
////            T_user user = t_userService.findUserByUsername(username) ;
////            if (user != null){
////                //将查询到的用户账号和密码存放到 authenticationInfo用于后面的权限判断。第三个参数随便放一个就行了。
////                AuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(user.getUserName(),user.getPassword(),
////                        "a") ;
////                return authenticationInfo ;
////            }else{
////                return  null ;
////            }
////        }
//
//}