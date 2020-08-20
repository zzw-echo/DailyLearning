package demo.demo0817;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者 ： zhangzewen
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/8/17 15:20
 * 描述 ：
 */
public class demo1 {

    //    List<SvnPermissionDTO> svnUserPermissionDTOList = svnPermissionService.selectByExample(svnPermission, rowBounds);
//    List<SvnPermissionDTO> svnUserPermissionDTOList = new ArrayList<>();
//    List<SvnPermissionDTO> svnPermissionDTOs = new ArrayList<SvnPermissionDTO>();
//    //生成树形结构
//    for(SvnPermissionDTO svnPermissionDTO:svnUserPermissionDTOList)
//    {
//        if (svnPermissionDTO != null) {
//            if (svnPermissionDTO.getParentPermissionId() != null && svnPermissionDTO.getParentPermissionId() == 0) {
//                SvnPermissionDTO svnPermissionDTO1 = svnPermissionService.selectChild(svnPermissionDTO);
//                svnPermissionDTOs.add(svnPermissionDTO1);
//            }
//        }
//    }
//
//
//    public SvnPermissionDTO selectChild(SvnPermissionDTO svnPermissionDTO) {
//        List<SvnPermissionDTO> svnPermissionDTOList = selectChildByParentCode(svnPermissionDTO.getId() + "-");
//        if (svnPermissionDTOList != null) {
//            //查询下一级子节点
//            List<SvnPermissionDTO> svnPermissionDTO1 = selectChildByALLChild(svnPermissionDTOList, svnPermissionDTO);
//            if (svnPermissionDTO1.size() != 0) {
//                //有下一级子节点的话遍历子节点
//                for (SvnPermissionDTO svnPermissionDTO2 : svnPermissionDTO1) {
//                    if (svnPermissionDTO2 != null) {
//                        //通过一个中间对象来接受递归返回的对象
//                        SvnPermissionDTO temp = selectChild(svnPermissionDTO2);
//                        //将递归返回的对象加到他的上一级父节点上
//                        svnPermissionDTO.getChildren().add(temp);
//                    } else {
//                        return svnPermissionDTO;
//                    }
//                }
//            }
//        }
//        return svnPermissionDTO;
//    }
//
//
//    public List<SvnPermissionDTO> selectChildByALLChild(List<SvnPermissionDTO> svnPermissionDTOList, SvnPermissionDTO svnPermissionDTO) {
//        List<SvnPermissionDTO> svnPermissionDTOs = new ArrayList<SvnPermissionDTO>();
//        if (svnPermissionDTOList.size() != 0) {
//            if (svnPermissionDTO != null) {
//                //遍历所有子节点集合
//                for (SvnPermissionDTO svnPermissionDTO1 : svnPermissionDTOList) {
//                    //如果有子节点就加到集合中去
//                    if (svnPermissionDTO1.getParentPermissionId() == svnPermissionDTO.getId()) {
//                        svnPermissionDTOs.add(svnPermissionDTO1);
//                    }
//                }
//            }
//        }
//        return svnPermissionDTOs;
//    }


}
