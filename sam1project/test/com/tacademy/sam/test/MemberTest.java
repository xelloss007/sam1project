package com.tacademy.sam.test;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.tacademy.sam.vo.Member;
import com.tacademy.sam.vo.MemberListResult;

public class MemberTest {

	public MemberTest() {
		// TODO Auto-generated constructor stub
		
		ArrayList<Member> list = new ArrayList<Member>();
		list.add(new Member("홍길동1", 30, "010-1111-1111")); //어노미어스 오브젝트
		list.add(new Member("홍길동2", 31, "010-2111-1111")); //어노미어스 오브젝트
		list.add(new Member("홍길동3", 32, "010-3111-1111")); //어노미어스 오브젝트
		list.add(new Member("홍길동4", 33, "010-4111-1111")); //어노미어스 오브젝트
		list.add(new Member("홍길동5", 34, "010-5111-1111")); //어노미어스 오브젝트
		list.add(new Member("홍길동6", 35, "010-6111-1111")); //어노미어스 오브젝트
		list.add(new Member("홍길동7", 36, "010-7111-1111")); //어노미어스 오브젝트
		list.add(new Member("홍길동8", 37, "010-8111-1111")); //어노미어스 오브젝트
		list.add(new Member("홍길동9", 38, "010-9111-1111")); //어노미어스 오브젝트
		
		MemberListResult result = new MemberListResult();
		result.setList(list);
		result.setStatus("success");
		result.setCount(list.size());
		
		Gson gson = new Gson();
		String str = gson.toJson(result);
		System.out.println(str);
		
		
		
		
		
//		Member member = new Member();
//		member.setName("홍길동");
//		member.setAge(30);
//		member.setTel("010-7224-8386");
//		
//		
//		Gson gson = new Gson();
//		String str = gson.toJson(member);
//		System.out.println(str);
//		System.out.println(member);
//		String obj ="{\"name\":\"홍길동\",\"age\":30,\"tel\":\"010-7224-8386\"}";
//		Member member1 = gson.fromJson(obj, Member.class);
//		System.out.println(member1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MemberTest();
	}

}
