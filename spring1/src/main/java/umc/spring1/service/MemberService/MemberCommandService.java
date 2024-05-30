package umc.spring1.service.MemberService;

import umc.spring1.domain.Member;
import umc.spring1.web.dto.MemberRequestDTO;

public interface MemberCommandService {

    Member joinMember(MemberRequestDTO.JoinDTO request);
}
