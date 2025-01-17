package com.app.togetheryoungback.mapper;

import com.app.togetheryoungback.domain.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
//친구 Mapper
public interface FriendMapper {
    //    친구 추가
    public void insert(FriendVO friendVO);

    //    친구 삭제
    public void delete(Long id);

    //    친구 검색
    public List<FriendDTO> selectFriend(Search search);

    //    친구 리스트 목록으로 이동
    public List<FriendDTO> selectAllFriend(Long memberId);

//    친구가 최근 보낸 쪽지 상세보기
    public MessageSentDTO friendSentMessage(Long messageId);

//    친구가 최근 받은 쪽지 상세보기
    public MessageReceivedDTO friendReceivedMessage(Long messageId);


}
