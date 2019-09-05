const solution = record => {
	const nameMap = makeRecordName(record);

	const resultMsg = [];
	for (let i = 0; i < record.length; i++) {
		let splitRecord = record[i].split(' ');

		if (splitRecord[0] === 'Enter') {
			let name = nameMap.get(splitRecord[1]);

			if (name) {
				resultMsg.push(`${name}님이 들어왔습니다.`);
			} else {
				resultMsg.push(`${splitRecord[1]}님이 들어왔습니다.`);
			}
		} else if (splitRecord[0] === 'Leave') {
			let name = nameMap.get(splitRecord[1]);

			if (name) {
				resultMsg.push(`${name}님이 나갔습니다.`);
			} else {
				resultMsg.push(`${splitRecord[1]}님이 나갔습니다.`);
			}
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
