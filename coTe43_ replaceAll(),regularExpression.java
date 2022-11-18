class Solution {
	public String solution(String new_id) {

		String s = new KAKAOID(new_id)
				.replaceToLowerCase()  // 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
				.filter()              // 2단계 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다
				.toSingleDot()         // 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
				.noStartEndDot()       // 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
				.noBlank()             // 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
				.noGreaterThan16()     // 6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다. 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
				.noLessThan2()         // 7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
				.getResult();          // 바뀐 문자를 return해줍니다.  private 속성의 필드값이기 때문에 get이 반드시 필요


		return s;
	}

	private static class KAKAOID {
		private String s;

		KAKAOID(String s) {
			this.s = s;
		}

		private KAKAOID replaceToLowerCase() {   // 1단계로 소문자로 바꾸어줍니다.
			s = s.toLowerCase();
			return this;
		}

		private KAKAOID filter() {      // 2단계로 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
			s = s.replaceAll("[^a-z0-9._-]", "");  // 정규식으로써 a~z, 0~9,._-는 제외한 모든 것을 ""으로 바꾼다.
			return this;
		}

		private KAKAOID toSingleDot() {
			s = s.replaceAll("[.]{2,}", ".");  // .이 2번이상이라면 전부 .으로 바꾼다.
			return this;
		}

		private KAKAOID noStartEndDot() {
			s = s.replaceAll("^[.]|[.]$", "");  ^[.]는 시작이 .을 나타내며,  [.]$는 마지막이 .인 경우를 나타냅니다.
			return this;
		}

		private KAKAOID noBlank() {
			s = s.isEmpty() ? "a" : s;    // 해당 아이디가 비어있다면 a를 넣어준다.
			return this;
		}

		private KAKAOID noGreaterThan16() {  // 해당 아이디가 15자가 넘는다면 15자까지만 출력해준다.
			if (s.length() >= 16) {
				s = s.substring(0, 15);
			}
			s = s.replaceAll("[.]$", "");  // 자르고 나서 만약 마지막이 .이라면 ""로 바꿔준다.
			return this;
		}

		private KAKAOID noLessThan2() {
			StringBuilder sBuilder = new StringBuilder(s);  // 이때까지의 값을 스트링 빌더로 준다.
			while (sBuilder.length() <= 2) { // 만약 id가 두글자 이하라면 반복문을 실행한다.
				sBuilder.append(sBuilder.charAt(sBuilder.length() - 1));  // id의 마지막을 마지막에 붙여준다.
			}
			s = sBuilder.toString(); // 스트링 빌더를 다시 String으로 바꿔준다.
			return this;
		}

		private String getResult() {
			return s;
		}
	}
}