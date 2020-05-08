package com.sist.di03;

// 생성자를 이용해서 사용하는방법
public class ServiceImpl {

		private Dao dao;
		
		public ServiceImpl() {}//기본생성자
		public ServiceImpl(Dao dao) {
			this.dao = dao;
		}//인자생성자
		
		
		//비지니스 로직
		public void biz() {
			dao.add();
		}
		
}
