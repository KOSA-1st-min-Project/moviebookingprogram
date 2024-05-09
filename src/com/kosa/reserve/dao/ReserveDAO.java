package com.kosa.reserve.dao;

import java.sql.SQLException;

import com.kosa.member.vo.MemberVO;

public interface ReserveDAO {
	public int insertReservation(int reserveQuantity, int memberVO) throws SQLException;

	// 상영 DATE, TIME 상영관 이름으로 SCHEDULE_NO 가져오기
	int getScheduleNo(String scheduleDate, String scheduleTime, String screenName) throws SQLException;
}
