package dao;

import java.util.Collection;

import vo.customVo.StudentCompletionVO;

public interface CompletionDAO {

	Collection<StudentCompletionVO> getStudentsCompletionInfoList();

	Collection<StudentCompletionVO> getStudentsCompletionInfoByCourseId(int courseId);

	Collection<StudentCompletionVO> getStudentsCompletionInfoByName(String name);

	Collection<StudentCompletionVO> getStudentsCompletionInfoByHrdNetId(String name);
}
