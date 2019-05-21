package level1;

//c++ 문제풀이
//#include <vector>
//
//using namespace std;
//
//long long solution(int N) {
//    long long answer = 0;
//    bool check[10000001] = {false,};
//    
//    for(int i=2; i<=N; i++){
//        if(!check[i]){
//            answer += i;
//        }
//        for(int j=i; j<=N; j+=i){
//            check[j] = true;
//        }
//    }
//    
//    return answer;
//}