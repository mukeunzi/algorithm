const solution = record => {
	const nameMap = makeRecordName(record);

	const resultMsg = [];

	for (let i = 0; i < record.length; i++) {
		let splitRecord = record[i].split(' ');

		if (splitRecord[0] === 'Enter') {
			resultMsg.push(`${nameMap.get(splitRecord[1])}님이 들어왔습니다.`);
		} else if (splitRecord[0] === 'Leave') {
			resultMsg.push(`${nameMap.get(splitRecord[1])}님이 나갔습니다.`);
		}
	}

	return resultMsg;
};

const makeRecordName = record => {
	const nameMap = new Map();

	for (let i = 0; i < record.length; i++) {
		let splitRecord = record[i].split(' ');

		if (splitRecord.length === 3) {
			nameMap.set(splitRecord[1], splitRecord[2]);
		}
	}

	return nameMap;
};

const arr = [
	'Enter uid1234 Muzi',
	'Enter uid4567 Prodo',
	'Leave uid1234',
	'Enter uid1234 Prodo',
	'Change uid4567 Ryan'
];

console.log(solution(arr));
