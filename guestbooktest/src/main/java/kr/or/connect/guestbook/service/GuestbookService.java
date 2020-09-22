package kr.or.connect.guestbook.service;

import java.util.List;

import kr.or.connect.guestbook.dto.Guestbook;

public interface GuestbookService {
	public static final int limit = 5;
	public List<Guestbook> getGuestbooks(int start);
	public int deleteGuestbook(Long id, String ip);
	public Guestbook addGuestbook(Guestbook guestbook,String ip);
	public int getCount();
}
