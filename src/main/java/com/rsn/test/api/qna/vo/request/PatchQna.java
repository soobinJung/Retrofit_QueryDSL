package com.rsn.test.api.qna.vo.request;

import com.rsn.test.api.qna.vo.QnaVO;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class PatchQna {

    @NotBlank(message = "lqnTitle을 입력해주세요.")
    String lqnTitle;

    @NotBlank(message = "lqnContent을 입력해주세요.")
    String lqnContent;

    public QnaVO toQnaVO(){
        return QnaVO.builder()
                .lqnTitle(lqnTitle)
                .lqnContent(lqnContent)
                .build();
    }
}
